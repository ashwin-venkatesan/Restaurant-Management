# Restaurant-Management
# Case Study on Restaurant Management using JAVA.

## Classes of the Case Study

| **Object** | **State** | **Behavior** |
| --- | --- | --- |
| **Waiter** | TableNo.ItemNoItemNameQuantityAvailabilityOrderStatusFeedback | SearchItem() <br/> ConfirmOrder() <br/> SetOrderStatus() <br/> AddToBill() <br/> GetFeedback() |
| **Customer** | ReservationIDNameTableNo.NumberOfGuestsOrderItemsBill | SearchItem() <br/> OrderItem() <br/> PlaceBill() |
| **Menu** | CuisineTypeNameRecipePrice | GetAvailability()|
| **Kitchen** | ResourceTypeResourceLevelAvailavilityCurrentStatus | SetAvailability() <br/> SetCurrentStatus()|
| **Restaurant** | StatusTableNo,BillAmountOverallFeedback | SetStatus() <br/> CalcBill() <br/> SendBill() <br/> SetFeedback() |
| **Table** | TableNo.NoOfSeatsStatus | SetStatus() <br/> AssignTable() <br/> ChangeNOS() |
| **Reservation** | ReservationIDNoOfGuestsName | Read() |
| **Feedback** | NameFeedbackEmailIDBirthAnniversaryPhoneNumber | Read() <br/> UploadFeedback() |

#
## Object Interaction

| **Object Names** | **Purpose** |
| --- | --- |
| Customer, Waiter | Table booking, Table allocation, Orderplacement, Receiving bills and payment |
| Waiter, Kitchen | Passing orders, Checking availability ofdishes, return of order and its current status |
| Waiter, Restaurant | Checking table availability status, Passing oforders, Preparing bills. |

#
## OBJECT MODEL

![Object Model](images/objectModel.png)