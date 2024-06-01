public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = Integer.valueOf(args[0]);

        if(nota >= 7)
            System.out.println("Aprovado");

            else if (nota >= 5 && nota < 7)
                System.out.println("Prova de recuperação");

            else
                System.out.println("Reprovado");

        //==============CONDIÇÕES TERNÁRIAS====================//

        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
