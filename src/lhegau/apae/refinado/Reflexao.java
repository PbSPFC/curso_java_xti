package lhegau.apae.refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflexao {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String nome = "lhegau.apae.poo.Conta";
		Class classe = Class.forName(nome);
		System.out.println(classe.getSimpleName());
		
		
		Field[] f = classe.getFields();
		for (Field field : f) {
			System.out.println(field.getName());
		}
		
		System.out.println("\n--------------------------------------------------\n");
		
		Method[] m = classe.getDeclaredMethods();
		for (Method method : m) {
			System.out.println(method.getName());
		}
		
		System.out.println("\n--------------------------------------------------\n");
		
		Constructor[] c = classe.getConstructors();
		for (Constructor constructor : c) {
			System.out.println(constructor);
		}
		
		Object o = classe.newInstance();
		Method md = classe.getMethod("deposita", double.class);
		Method me = classe.getMethod("exibeSaldo");
		md.invoke(o, 120);
		me.invoke(o);
		
		Constructor co = classe.getConstructor(String.class, double.class);
		Object obj = co.newInstance("Lagarto", 10_000);
		me.invoke(obj);
		
		
	}

}
