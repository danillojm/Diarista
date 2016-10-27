package br.com.diaristaAppWeb.util;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public abstract class Utils {
	
	public static String diasVencimentoFormatado(int diaVencimento) {
		DateFormat formatador = DateFormat.getDateInstance();
		Locale myLocale = Locale.getDefault();
		Calendar dataAtual = Calendar.getInstance(myLocale);
		dataAtual.add(Calendar.DATE, +diaVencimento);
		Date date = dataAtual.getTime();
		String string = formatador.format(date);
		return string;

	}

}
