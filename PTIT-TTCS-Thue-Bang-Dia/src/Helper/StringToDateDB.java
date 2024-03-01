package Helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateDB {
    public static String convertToDateDB(String inputDate) {
        
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        String convertedDate = null; 
        
        try {
            Date date = inputFormat.parse(inputDate);
            convertedDate = outputFormat.format(date);
            
        } catch (ParseException e) {
            System.out.println("Lỗi khi chuyển đổi ngày.");
            e.printStackTrace();
        }
               
        return convertedDate;
    }
}
