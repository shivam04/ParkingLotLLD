package services;

import dtos.GetTicketDTO;
import models.ParkingSpot;
import models.Ticket;
import models.Vehicle;

public class EntryGateService {
    SlotAllocationService slotAllocationService = new SlotAllocationService();
    ParkingSpotService parkingSpotService = new ParkingSpotService();
    TicketService ticketService = new TicketService();

    public GetTicketDTO getTicket(Vehicle vehicle) {
        ParkingSpot spot = slotAllocationService
                .allocateSlot(vehicle.getType());
        ParkingSpot availableSpot = parkingSpotService.markSpotBooked(spot);
        Ticket ticket = ticketService.createTicket(vehicle, availableSpot);
        GetTicketDTO dto = new GetTicketDTO();
        dto.setTicket(ticket);
        return dto;
    }
}
