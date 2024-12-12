import entities.Usuario;
import java.util.List;

import DAO.UsuarioDao;

public class App {
    public static void main(String[] args) {
        UsuarioDao usuarioDao = new UsuarioDao();

        List<Usuario> usuarios = usuarioDao.mostrarUsuarios();

        // Verifica se a lista não é nula e não está vazia
        if (usuarios != null && !usuarios.isEmpty()) {
            for (Usuario usuario : usuarios) {
                System.out.println("ID: " + usuario.getCodigo());
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Login: " + usuario.getLogin());
                System.out.println("Email: " + usuario.getEmail());
                System.out.println("------------------------");
            }
        } else {
            System.out.println("Nenhum usuário encontrado.");
        }
    }
}
