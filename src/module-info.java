/**
 * 
 */
/**
 * 
 */
module Teste_TARGET_3 {
	
	
	    requires com.fasterxml.jackson.databind;
	    requires com.fasterxml.jackson.core;
	    requires com.fasterxml.jackson.annotation;
	    requires com.fasterxml.jackson.datatype.jsr310; // Adicione esta linha
	    // Adicione outras dependências conforme necessário
	 // Exporta o pacote entities para o módulo com.fasterxml.jackson.databind
	    exports ex3.entities to com.fasterxml.jackson.databind;
}