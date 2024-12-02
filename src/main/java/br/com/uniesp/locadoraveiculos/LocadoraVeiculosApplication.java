package br.com.uniesp.locadoraveiculos;

import br.com.uniesp.locadoraveiculos.adapter.repository.ClienteRepository;
import br.com.uniesp.locadoraveiculos.adapter.repository.LocacaoRepository;
import br.com.uniesp.locadoraveiculos.adapter.repository.VeiculosRepository;
import br.com.uniesp.locadoraveiculos.config.RandomStringGenerator;
import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;
import br.com.uniesp.locadoraveiculos.domain.entity.LocacaoEntity;
import br.com.uniesp.locadoraveiculos.domain.entity.VeiculosEntity;
import br.com.uniesp.locadoraveiculos.domain.enums.StatusLocacao;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
@RequiredArgsConstructor
public class LocadoraVeiculosApplication {

    private final ClienteRepository clienteRepository;
    private final VeiculosRepository veiculosRepository;
    private final LocacaoRepository locacaoRepository;

    public static void main(String[] args) {
        SpringApplication.run(LocadoraVeiculosApplication.class, args);
    }

    @PostConstruct
    public void preenchendoDatabase() {
        var generator = new RandomStringGenerator(10);
        var random = new Random();
        for (int i = 0; i < 50; i++) {
            criarCliente(generator);
            criarVeiculos(generator, random);
        }
        criarLocacao();
    }

    private void criarCliente(RandomStringGenerator generator) {
        var cliente = new ClienteEntity();
        cliente.setNome(generator.nextString());
        cliente.setEmail(generator.nextString() + "@email.com");
        cliente.setTelefone(generator.nextString());
        cliente.setEndereco(generator.nextString());
        cliente.setCidade(generator.nextString());
        cliente.setEstado(generator.nextString());
        cliente.setCep(generator.nextString());
        cliente.setNumeroDocumento(generator.nextString());

        clienteRepository.save(cliente);
    }

    private void criarVeiculos(RandomStringGenerator generator, Random random) {
        var veiculo = new VeiculosEntity();
        veiculo.setPlaca(generator.nextString());
        veiculo.setModelo(generator.nextString());
        veiculo.setCor(generator.nextString());
        veiculo.setDescricao(generator.nextString());
        veiculo.setCategoria(generator.nextString());
        veiculo.setPreco(random.nextDouble() * 250);

        veiculosRepository.save(veiculo);
    }

    private void criarLocacao() {
        var locacao = new LocacaoEntity();
        locacao.setIdCliente(1L);
        locacao.setIdVeiculo(1L);
        locacao.setLocacao(StatusLocacao.ANDAMENTO);
        locacao.setDataLocacao(LocalDate.now());
        locacao.setDataDevolucaoCombinada(LocalDate.now().plusDays(7));

        locacaoRepository.save(locacao);
    }
}
