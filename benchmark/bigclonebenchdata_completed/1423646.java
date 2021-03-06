
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1423646 {
public MyHelperClass connection;
	public MyHelperClass criaConexao(boolean o0){ return null; }
	public MyHelperClass fechaConexao(){ return null; }

    public void removerDisciplina(Disciplina disciplina) throws ClassNotFoundException, SQLException {
        this.criaConexao(false);
        String sql = "DELETE FROM \"Disciplina\"    " + "      WHERE ID_Disciplina =  ? )";
        PreparedStatement stmt = null;
        try {
            stmt =(PreparedStatement)(Object) connection.prepareStatement(sql);
            stmt.setString(1, disciplina.getId());
            stmt.executeUpdate();
            connection.commit();
        } catch (UncheckedIOException e) {
            connection.rollback();
            throw e;
        } finally {
            try {
                stmt.close();
                this.fechaConexao();
            } catch (UncheckedIOException e) {
                throw e;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Disciplina {

public MyHelperClass getId(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
