Feature: To validate fb creation
Scenario: FB Creation
Given To launch browser and maximize
When To launch facebook url
And To  click create new account
And To pass first name in firstname text box
|dhana|dhanabalan|k.dhanabalan|kddhanabalan|
And To pass lastname in lastname text box
|lastname1|Engineer|
|lastname2|doctor|
|lastname3|Devoleper|
And to pass mobileno or email in that text box
|abcd|efgh|ijkl|
|mnop|qrst|uvwxy|
And To create new password in password
|password1|password2|
|1234567|789123|
|098765|4321098|
Then Close the Browser