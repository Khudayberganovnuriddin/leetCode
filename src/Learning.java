import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Learning {
    public static void main(String[] args) {
        for (CalcDto value : calcDeposit(1, 1000000D, 23f)) {
            System.out.printf("%s %.2f %.2f\n", value.getDate(), value.getAmount(), value.getInterest());
        }
    }

    public static List<CalcDto> calcDeposit(Integer duration, Double amount, Float interest) {
        List<CalcDto> result = new ArrayList<>();
        LocalDateTime dateTime = LocalDateTime.now();
        double sum = 0D;
        for (int i = 0; i < duration; i++) {
            double interestAmount = amount * interest / 100;
            int days = YearMonth.of(dateTime.getYear(), dateTime.getMonth()).lengthOfMonth();
            if (i == 0) days--;
            interestAmount = interestAmount / 365 * days;
            sum += interestAmount;

            dateTime = dateTime.plusMonths(1);
            String date = String.format("%02d.%02d.%d", dateTime.getDayOfMonth(), dateTime.getMonthValue(), dateTime.getYear());
            CalcDto CalcDto = new CalcDto(date, Math.round(sum*100)/100D, Math.round(interestAmount * 100) / 100D);

            result.add(CalcDto);
        }
        return result;
    }
}
