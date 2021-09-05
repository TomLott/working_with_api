<h3>Working with api</h3>

Testing few ways to work with external api.

After receiving request, our server sends request to external api.<br>

Marketstack is a stock data api (https://marketstack.com/).

Some request examples:

    http://localhost:8080/tickers

    http://localhost:8080/tickers-name

    http://localhost:8080/eod/aapl

    http://localhost:8080/intraday/aapl

<h4>In project used:</h4>
- RestTemplate
- Simple filters