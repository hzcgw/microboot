package ga.hzcgw;

import ga.hzcgw.service.SaleTicketService;

public class TestSaleTicket {
    public static void main(String[] args) {
        SaleTicketService saleTicketService = new SaleTicketService(10);
        for (int i = 0; i < 15; i++) {
            new Thread(()->{
                saleTicketService.saleTicket();
            }, "票贩子 - " + i).start();
        }
    }
}
