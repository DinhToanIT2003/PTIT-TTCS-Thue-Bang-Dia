/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import com.toedter.calendar.JDateChooser;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author vduct
 */
public class DateConfig {
    public String getDate(JDateChooser dateChooser){
        dateChooser.setDateFormatString("dd-MM-yyyy");
        LocalDate selectedDate = dateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedDate = selectedDate.format(formatter);
                return formattedDate;
    }
}
