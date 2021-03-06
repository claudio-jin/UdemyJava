import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramCalendar {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//formato de hora/data
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));//formato utc
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);	//instancia o date para o calendar
		
		cal.add(Calendar.HOUR_OF_DAY, 4);	//add 4 horas no dia
		d = cal.getTime();	//d recebe a data atualizada
		
		System.out.println(sdf.format(d));
	}
}
