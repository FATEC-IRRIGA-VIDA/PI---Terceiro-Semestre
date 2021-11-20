package metodos;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


@SuppressWarnings("serial")
public class DocumentoLimitado extends PlainDocument{
	
	private int tamanhoMax = 10;

	/***
	 * Método que recebe o valor máximo de caracteres do campo do JTextField.
	 * @param tamanhoMax - tamanho máximo armazenado.
	 */
	public DocumentoLimitado(int tamanhoMax){
		this.tamanhoMax = tamanhoMax;
	}
	
	/***
	 * Método que irá testar as condições de validação dos campos entre o valor definido e o inserido na JTextField.
	 */
	public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {

		// testamos se veio algum texto para ser inserido, senão utilizamos um return para finalizar o método
		if (str == null) return;  

		// pegamos o texto já presente no componente.
		String stringAntiga = getText (0, getLength() );  
		
		// somamos o número de caracteres do texto já presente com o número de caracteres do texto a ser inserido
		int tamanhoNovo = stringAntiga.length() + str.length(); 

        /*Se não for superior chamamos o método da superclasse(PlainDocument) super.insertString que irá inserir o novo texto 
         * no componente, se o número total de caracteres for maior chamamos o método super.insertString mas passamos como 
         * segundo parâmetro uma string vazia para não inserir nada( poderíamos simplesmente não chamar o método também).
         */
		
		if (tamanhoNovo <= tamanhoMax) {  
			super.insertString(offset, str , attr);  
			//super.insertString(offset, str.replaceAll("[^a-z]","") , attr); // apenas letras
			//super.insertString(offset, str.replaceAll("[^a-z|^0-9]","") , attr); // letras e números
		} else {    
			super.insertString(offset, "", attr); 
		}  
	}
}
