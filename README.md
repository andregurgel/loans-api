[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white
[JAVA_BADGE]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[MAVEN_BADGE]: https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white
[POSTMAN_BADGE]: https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white

# Link Shortener 💻

![Spring][SPRING_BADGE]
![Java][JAVA_BADGE]
![Apache Maven][MAVEN_BADGE]
![Postman][POSTMAN_BADGE]

An API developed to test knowledge and for that I created an API that is responsible for informing you whether you are entitled to any type of loan.

### Resum

The idea is to provide an endpoint that the user will consume and send personal data to be evaluated,
and depending on the data provided we will evaluate and present the types of loans available. The inspiration 
for this project was taken from the following [repository](https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md).

## 🚀 Getting started

### Requirements

1. Java 21
2. Maven

### Step by Step

1. Clone this repository.
```bash
git clone https://github.com/andregurgel/loans-api.git
```

2. Download the project requests collection in postman by clicking [here](https://github.com/andregurgel/loans-api/blob/main/loans-postman.json). (Optional)
3. Okay, it looks like we're done there.

## 📍 API Endpoints

| route                              | description                                          
|------------------------------------|-----------------------------------------------------
| <kbd>POST /customer-loans</kbd>       | send customer data. [request details](#post-shorten-url)

<h3 id="post-shorten-url">POST /shorten-url</h3>

**REQUEST**
```json
{
  "age": 26,
  "cpf": "275.484.389-23",
  "name": "Vuxaywua Zukiagou",
  "income": 7000.00,
  "location": "SP"
}
```

**RESPONSE**
```json
{
  "customer": "Vuxaywua Zukiagou",
  "loans": [
    {
      "type": "PERSONAL",
      "interest_rate": 4
    },
    {
      "type": "GUARANTEED",
      "interest_rate": 3
    },
    {
      "type": "CONSIGNMENT",
      "interest_rate": 2
    }
  ]
}
```

**RESPONSE ERROR**

```json
{
  "status": "NO_CONTENT",
  "message": "No loan available to customer."
}
```

<h2 id="colab">🤝 Owner</h2>

I want to thank in advance all the people who were interested in the project and downloaded it to test it!

<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/32176559?v=4" width="100px;" alt="Andre Gurgel Profile Picture"/><br>
        <sub>
          <b>André Gurgel</b>
        </sub>
      </a>
    </td>
  </tr>
</table>