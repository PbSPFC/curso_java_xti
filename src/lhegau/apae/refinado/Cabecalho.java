package lhegau.apae.refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Documented
public @interface Cabecalho {
	
	String instituicao();
	String projeto();
	String dataDeCriacao();
	String criador();
	int revisao() default 1;
	
}
