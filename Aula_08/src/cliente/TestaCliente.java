package cliente;

public class TestaCliente {
    public static void main(String[] args) {

    // Testes dos objetos usando a classe Cliente
    Cliente cl1 = new Cliente("Vinicius Prazeres", 26, "Desenvolvedor de software", 10000.0f, "rafaelgouvea@jmail.com");
    Cliente cl2 = new Cliente("João da Silva", 40, "Engenheiro de computação", 15000.0f, "joaodasilva@jmail.com");
    cl1.visualizar();
    cl2.visualizar();

    // Testes dos objetos usando a classe PessoaFisica
    PessoaFisica pf1 = new PessoaFisica("Yuna", 33, "Policial Civil", 6000.0f, "yuna@ymail.com", "987.666.432-09", "34.779.934-6");
    PessoaFisica pf2 = new PessoaFisica("Layla", 32, "Médica Veterinária", 15000.0f, "layla@lmail.com", "567.654.567-08", "32.745.945-7");
    pf1.visualizar();
    pf2.visualizar();

    // Testes dos objetos usando a classe PessoaJuridica
    PessoaJuridica pj1 = new PessoaJuridica("Tiago", 40, "Empreendedor", 35000.0f, "tiago@tmail.com", "12.345.678/0001-00");
    PessoaJuridica pj2 = new PessoaJuridica("Camila", 27, "Advogada", 70000.0f, "camila@cmail.com", "15.874.567/0003-00");
    pj1.visualizar();
    pj2.visualizar();

    }
}