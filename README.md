# User Management Screen
### User Interface Specification Document For The User Management Screen
*   A table showing users registered in the system will be created.
*   This interface will be directed to the register page(New User).
*   On the new user addition page, information fields with details will be created and user registration will be performed.
******************
#### New User Button
It will be located in the upper left of the table.**[New User](#)**

> These buttons will take place ***symbolically*** in the title of the column to which they belong(***Not as text***).
> **New User** buttons background color is ***primary***.(Blue)

The button should look like this. ** [+ New User] (#) **
> The "+" symbol here should be shown as a symbol and again its color should be white.

**The new user button should direct to the new user registration form.**

***************************
#### Hide Disabled User Option
- [x] Hide Disabled User

***The table must be associated with this option. An option button that indicates whether to show blocked users or not. When the selection is made, it updates the data in the table.***
*It should be next to the new user button.(from right)*
******************
### Save User Button
The **Save User** button is for sending the data created to the database and table after the form has been filled in completely.
**[Save User](#)** should be in the form. The *background* color will be **light blue**. *Text color* is **white.**
*****************
## Buttons and Hide Disabled User Layout
**Flexbox** should be used. It will be in navbar view and will cover the entire top of the page. Each button and unit will take up one tenth of the flexbox. The *New User* and *Disabled User* will be next to each other. These will be on the far left of the page. *Save User* button should be on the far right of the page. There should be a certain amount of space between the leftmost and rightmost units. (7 out of 10) The background color of the Flexbox is pale gray.

*****************
#### Registered Users Table

| ID *Sorting* *Filter*     | User Name *Sorting* *Filter*  | Email *Sorting* *Filter*       | Enabled *Sorting* *Filter*  |
| :---        |    :----:   |   :----:      |     ---:  |
| 1           | AdminUser   | admin@piworks.net | True          |
| 2           | Test User   | testuser@ppiworks.net | True          |
|       |  |      |
|         |       |           |
|      |       |   |
|    |       |       |


*The user table will look like this.* There will be buttons where **[Sorting](#)** and **[Filter](#)** is written in the table. .
> These buttons will take place ***symbolically*** in the title of the column to which they belong(***Not as text***).
*********************
#### Table Background and Text Color
- The background colors of the captions of the table will be *blue* and the color of the text and symbols (buttons) of the table will be *white*.
- According to the nth child of the rows in the table, the background color of the even-numbered rows will be light blue.

The information in the table will be taken from the database.
************

## New User Form

##### Title
New User should be written in the title. Above the form field should continue throughout the form field. The background color should be *pale gray* and text color is *black*.

*******
The content of the form should be as follows.
Username    : ___________ <br>
Display Name: ___________
Phone    : ___________
Email    : ___________
There should be **guest**, **admin** and **superAdmin** options in the form of dropdown menu input. In the explanation part, it should write **select user roles** in the input.
Enabled title include this
[ ] Enabled
*****
#### Specifications of Form
Each input field, dropdown menu and select list field should be *centered* and aligned equally in size.
The option clicked on in the Dropdown menu should be displayed in *blue*.

#### Save User Button
When the button is clicked, it receives the user information and sends it to the database. It is transferred from the database to the table and displayed.
When Enabled is selected, user registration is **enabled**.
********* 
## General Layout and Features of the Page

The user table and new user form field saved on the page must be under the flexbox at the top. Table and form should be created to use half of the page.

The design should be visually improved by using the ***Bootstrap*** library.
