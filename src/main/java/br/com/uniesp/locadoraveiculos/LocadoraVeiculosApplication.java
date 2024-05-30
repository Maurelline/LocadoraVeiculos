package br.com.uniesp.locadoraveiculos;

import br.com.uniesp.locadoraveiculos.adapter.repository.ClienteRepository;
import br.com.uniesp.locadoraveiculos.adapter.repository.VeiculosRepository;
import br.com.uniesp.locadoraveiculos.config.RandomStringGenerator;
import br.com.uniesp.locadoraveiculos.domain.entity.ClienteEntity;
import br.com.uniesp.locadoraveiculos.domain.entity.VeiculosEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Random;

@SpringBootApplication
public class LocadoraVeiculosApplication {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private VeiculosRepository veiculosRepository;

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
}
