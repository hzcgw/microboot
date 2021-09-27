package ga.hzcgw.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.Synchronized;

import java.util.concurrent.TimeUnit;

@Data
@AllArgsConstructor
public class SaleTicketService {
    private int tickets;

    @SneakyThrows
    @Synchronized
    public void saleTicket() {
        while (this.tickets > 0) {
            if (this.tickets > 0) {
                TimeUnit.SECONDS.sleep(1);
                System.err.println("【" + Thread.currentThread().getName() + "】 售票，tickets = " + this.tickets--);
            }
        }
    }
}
