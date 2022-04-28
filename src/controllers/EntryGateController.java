package controllers;

import dtos.GetTicketDTO;
import models.DisplayBoard;
import models.Vehicle;
import services.EntryGateService;

public class EntryGateController {
    EntryGateService entryGateService = new EntryGateService();

    DisplayBoard getDisplayBoard() {
        return null;
    }

    public GetTicketDTO getTicket(Vehicle vehicle) {
        return entryGateService.getTicket(vehicle);
    }
}


// Dependency Inversion: No 2 concrete classes should depend
// on each other.
// They should depend on each other via an interface.
// Dependency Inversion violated
// Nopt singletons
// No persistence