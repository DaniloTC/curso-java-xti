class LaboratorioVariaveis {
    public static void main(String[] args) {
        String nome = "Danilo Castro";
        String dataNascimento = "25/10/1987";
        String rg = "12.345.789-00";
        char sexo = 'M';
        double salario = 954.00;
        // Impressão 1 - usando concatenação
        System.out.println("O senhor "+nome+", portador do RG de numero "+rg+", nascido em "+dataNascimento+", do sexo "+sexo+", esta registrado com o salario de R$ "+salario);
        // Impressão 2 - formatando saida com printf
        System.out.printf("O senhor %s, portador do RG de numero %s, nascido em %s, do sexo %c, esta registrado com o salario de R$ %.2f\n", nome, rg, dataNascimento, sexo, salario);
        // Impressão 3 - formatando com interpolação, usei a função format do objeto String
        System.out.println(String.format("O senhor %s, portador do RG de numero %s, nascido em %s, do sexo %c, esta registrado com o salario de R$ %f", nome, rg, dataNascimento, sexo, salario));
    }
}