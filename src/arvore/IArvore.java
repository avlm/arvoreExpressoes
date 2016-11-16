package arvore;

public interface IArvore {
	public void inserir(TreeNode novo);
	public boolean remover(char info);
	public boolean existe(char info);
	public void percorreEmOrdem();
	public void percorrePosOrdem();
}
