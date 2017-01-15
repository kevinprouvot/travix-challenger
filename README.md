# Travix API Project

Travix project offers an API which serves the merged results from 2 differents flight search suppliers (CrazyAir and ToughJet)

## JSON format

Response served

| airline                | Name of Airline                   |
| supplier               | Eg: CrazyAir or ToughJet          |
| fare                   | Total price rounded to 2 decimals |
| departureAirportCode   | 3 letter IATA code(eg. LHR, AMS)  |
| destinationAirportCode | 3 letter IATA code(eg. LHR, AMS)  |
| departureDate          | Date Time in ISO8601              |
| arrivalDate            | Date Time in ISO8601              |

Search attributes

| origin             | 3 letter IATA code(eg. LHR, AMS) |
| destination        | 3 letter IATA code(eg. LHR, AMS  |
| departureDate      | Date in ISO8601                  |
| returnDate         | Date in ISO8601                  |
| numberOfPassengers | Maximum 4 passengers             |



