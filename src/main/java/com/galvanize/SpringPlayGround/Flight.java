package com.galvanize.SpringPlayGround;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/*
{
  "departs": "2017-04-21 14:34",
  "tickets": [
    {
      "passenger": {
        "firstName": "Some name",
        "lastName": "Some other name"
      },
      "price": 200
    }
  ]
}

flight = {departs, ticket [{passenger{firstname:blah, last:blah}, price},]}

 */

public class Flight {
    private Date departs = new Date();
    private ArrayList <Ticket>  tickets= new ArrayList <Ticket> ();

    public void addTicket (String firstName, String lastName) {
        HashMap <String, String> passenger = new HashMap<>();
        passenger.put("firstName", firstName);
        passenger.put("lastName", lastName);
        Ticket ticket = new Ticket ();
        ticket.setPassenger(passenger);
        this.tickets.add(ticket);
    }

    public ArrayList<Ticket> getTickets () {
        return this.tickets;
    }

    static class Ticket {
        private HashMap <String, String> passenger = new HashMap <> ();
        private int price = 200;

        public HashMap<String, String> getPassenger() {return passenger;}
        public void setPassenger(HashMap<String, String> passenger) {this.passenger = passenger;}

        public int getPrice() {return price;}
        public void setPrice(int price) {this.price = price;}
    }
}
