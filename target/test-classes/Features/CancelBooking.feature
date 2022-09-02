Feature: Verifying Adactin Cancel Booking details

  Scenario Outline: Verifying Adactin Cancel Booking
    Given User is on the Adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login "Hello Balaji2507!"
    And User should perform Search hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after Search hotel "Select Hotel"
    And User should Select the Hotel Name
    Then User should verify message "Book A Hotel" after click Continue
    And User should perform Book hotel "<firstName>","<lastName>" and "<address>"
      | creditCardNo     | creditCardType   | expMonth  | expYear | cvv |
      | 4567890123456789 | American Express | March     |    2020 | 345 |
      | 1234890123456789 | VISA             | July      |    2022 | 125 |
      | 9870890123456789 | Master Card      | May       |    2021 | 875 |
      | 4567890123456789 | Other            | September |    2020 | 346 |
    Then User should verify after Book Hotel "Booking Confirmation"
    And User should Cancel Order id
    Then User should verify after cancel Order id "The booking has been cancelled."

    Examples: 
      | username   | password   | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | address |
      | Balaji2507 | balaji2507 | London   | Hotel Creek | Standard | 2 - Two   | 19/08/2022  | 20/08/2022   | 2 - Two       | 2 - Two         | Arthi     | Balaji   | Chennai |

  Scenario Outline: Verifying Adactin Cancel Booking with Existing Order id
    Given User is on the Adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login "Hello Greens8767!"
    And User should Cancel Existing Order id "<orderId>"
    Then User should verify after cancel Order id "The booking has been cancelled."

    Examples: 
      | username   | password | orderId    |
      | Greens8767 | QN8V3A   | FY0264022R |
