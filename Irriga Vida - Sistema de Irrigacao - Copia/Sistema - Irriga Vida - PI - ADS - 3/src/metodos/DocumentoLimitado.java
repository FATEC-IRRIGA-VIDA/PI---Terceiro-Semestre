package metodos;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


@SuppressWarnings("serial")
public class DocumentoLimitado extends PlainDocument{
	
	private int tamanhoMax = 10;

	/***
	 * M�todo que recebe o valor m�ximo de caracteres do campo do JTextField.
	 * @param tamanhoMax - tamanho m�ximo armazenado.
	 */
	public DocumentoLimitado(int tamanhoMax){
		this.tamanhoMax = tamanhoMax;
	}
	
	/***
	 * M�todo que ir� testar as condi��es de valida��o dos campos entre o valor definido e o inserido na JTextField.
	 */
	public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {

		// testamos se veio algum texto para ser inserido, sen�o utilizamos um return para finalizar o m�todo
		if (str == null) return;  

		// pegamos o texto j� presente no componente.
		String stringAntiga = getText (0, getLength() );  
		
		// somamos o n�mero de caracteres do texto j� presente com o n�mero de caracteres do texto a ser inserido
		int tamanhoNovo = stringAntiga.length() + str.length(); 

        /*Se n�o for superior chamamos o m�todo da superclasse(PlainDocument) super.insertString que ir� inserir o novo texto 
         * no componente, se o n�mero total de caracteres for maior chamamos o m�todo super.insertString mas passamos como 
         * segundo par�metro uma string vazia para n�o inserir nada( poder�amos simplesmente n�o chamar o m�todo tamb�m).
         */
		
		if (tamanhoNovo <= tamanhoMax) {  
			super.insertString(offset, str , attr);  
			//super.insertString(offset, str.replaceAll("[^a-z]","") , attr); // apenas letras
			//super.insertString(offset, str.replaceAll("[^a-z|^0-9]","") , attr); // letras e n�meros
		} else {    
			super.insertString(offset, "", attr); 
		}  
	}
}
