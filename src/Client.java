import controllers.EntryGateController;
import dtos.GetTicketDTO;
import models.Vehicle;

public class Client {
    public static void main(String[] args) {
        EntryGateController entryGateController = new EntryGateController();
        Vehicle vehicle = new Vehicle();

        GetTicketDTO ticketDTO = entryGateController.getTicket(vehicle);
        System.out.println(ticketDTO);
    }
}
