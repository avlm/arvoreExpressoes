package arvore;

public class Arvore implements IArvore {
	
	private TreeNode raiz;

	public void inserir(TreeNode novo) {
		
		if (raiz == null) {
			raiz = novo;
		} else {
			TreeNode aux = raiz;
			
			if (aux.getRight() == null) {
				aux.setRight(novo);
			} else {
				aux.setLeft(novo);
			}
		}
		
	}

	public boolean remover(char info) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean existe(char info) {
		// TODO Auto-generated method stub
		return false;
	}

	public void percorreEmOrdem() {
		// TODO Auto-generated method stub
		
	}

	public void percorrePosOrdem() {
		// TODO Auto-generated method stub
		
	}
	
	public TreeNode getRaiz() {
		return raiz;
	}
	
	public void setRaiz(TreeNode raiz) {
		this.raiz = raiz;
	}

}
