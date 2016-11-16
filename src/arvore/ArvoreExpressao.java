package arvore;

import java.util.Stack;

public class ArvoreExpressao {
	
	Stack<TreeNode>  pilhaExp = new Stack();
	Stack<Character> pilhaOp  = new Stack();
	
	public void montarArvore(String exp) {
		
		char[] expressao = exp.toCharArray();
		Arvore arvExp = new Arvore();
		
		for (char c : expressao) {
			switch (c) {
				case '+':
					pilhaOp.push(c);
					break;
				case '-':
					pilhaOp.push(c);
					break;
				case '/':
					pilhaOp.push(c);
					break;
				case '*':
					pilhaOp.push(c);
					break;
				case ')':
					/** 
					 * retira um operador da pilhaOp para ser raiz,
					 * o primeiro node da pilhaExp vai ser o filho da direita
					 * e o segundo vai ser o filho da esquerda.
					 * empilha a arvore em pilhaExp.
					 */
					arvExp.setRaiz(null);
					break;
				default:
					if (Character.isLetterOrDigit(c)) {
						TreeNode novo = new TreeNode(c);
						arvExp.inserir(novo);
					} else {
						throw new RuntimeException("Sua Expressão possui um caractere inválido!");
					}
			}
		}
	}
	
	public void substituirVariaveis() {
		
	}
	
	public void imprimirExpressao() {
		
	}
	
	public String calcularExpressao() {
		return "true";
	}
}
