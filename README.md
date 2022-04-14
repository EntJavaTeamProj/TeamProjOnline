# Digimon Card Search System (DCSS)

Implements both the digimon api and digimoncard.io api to combine card information and digimon information into a neat package. Made to be implemented into more advanced programs so that card searches on those programs provide more in depth information.

## Made By:

[Ivy Jochem](https://github.com/ScarletIvy)

[Ashley Wagner](https://github.com/AshleyNWagner)

[Eduardo Burzlaff](https://github.com/eburzlaff)

[Matthew Lor](https://github.com/Mlor10)

## Resources
### Retrieve resources through:
- Digimon Card Name
- Digimon Card Number
- Digimon Card Type
- Digimon Card Attribute
<!-- end of list -->
<details>
<summary>
Resource Fields
</summary>
<blockquote>
<details>
<summary>
Digimon Card Source Effect
</summary>
soure_effect 
</details>
<details>
<summary>
Digimon Card Color Type
</summary>
color
</details>
<details>
<summary>
Digimon Card Digimon Type
</summary>
digi_type
</details>
<details>
<summary>
Digimon Card Sets
</summary>
card_sets
</details>
<details>
<summary>
Digimon Card Level
</summary>
level
</details>
<details>
<summary>
Digimon Card Rarity
</summary>
card_rarity
</details>
<details>
<summary>
Digimon Card Artist
</summary>
artist
</details>
<details>
<summary>
Digimon Card Image
</summary>
image_url
</details>
<details>
<summary>
Digimon Card Main Effect
</summary>
main_effect
</details>
<details>
<summary>
Digimon Card Type
</summary>
type
</details>
<details>
<summary>
Digimon Card Power
</summary>
dp
</details>
<details>
<summary>
Digimon Card Evolution Stage
</summary>
stage
</details>
<details>
<summary>
Digimon Card Set Origin
</summary>
set_name
</details>
<details>
<summary>
Digimon Image
</summary>
digimonImage
</details>
</blockquote>
</details>
<!-- end of details -->

### Operations
Each search grabs a response from the two public APIs and combines them into one response object with both of their 
resource fields combined. It excludes duplicate resource fields from the Digimon API. The response object is converted 
back into json for the response for the user.

#### Response Type is json (document).

## APIs Used

### digimoncard.io API

Used for baseline Card info

[Source](https://documenter.getpostman.com/view/14059948/TzecB4fH)

### Digimon API

Used to get Individual digimon info

[Source](https://digimon-api.herokuapp.com/)
