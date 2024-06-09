package padrao;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa emmanuel = new Pessoa("Emmanuel", "87687587289");

        emmanuel.setEndereco("Av. Sargento Herminio");

        System.out.println(emmanuel.getNome()+"-"+emmanuel.getCpf());
        
    }
}
