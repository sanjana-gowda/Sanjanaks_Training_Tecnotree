import React from "react";
import { Container, Row, Col, Button } from "reactstrap";
import "../App.css";
// import tours from "../components/Package";
import imgCard1 from "../img/img-card (1).jpg";
import imgCard2 from "../img/img-card (7).jpg";
import imgCard3 from "../img/img-card (3).jpg";
import imgCard4 from "../img/img-card (4).jpg";

const Tour = () => (
  <div className="subComponent">
    <Container>
      <section className="tour-cover item-center">
        <img src={imgCard1} alt="" />
        <h1>Qwe Resort</h1>
        <h4>Qwe Resort</h4>
      </section>
      <section className="tour-info">
        <Row>
          <Col sm="8">
            <div className="tour-desc">
              <p>
              Karnataka is a state in southwest India with Arabian Sea coastlines. 
              The capital, Bengaluru (formerly Bangalore), is a high-tech hub known for its shopping and nightlife.
              To the southwest, Mysore is home to lavish temples including Mysore Palace, former seat of the region’s maharajas. 
              Hampi, once the medieval Vijayanagara empire’s capital, contains ruins of Hindu temples, elephant stables and a stone chariot.
              </p>
              <p>
              Karnataka is a state in southwest India with Arabian Sea coastlines. 
              The capital, Bengaluru (formerly Bangalore), is a high-tech hub known for its shopping and nightlife.
              To the southwest, Mysore is home to lavish temples including Mysore Palace, former seat of the region’s maharajas. 
              Hampi, once the medieval Vijayanagara empire’s capital, contains ruins of Hindu temples, elephant stables and a stone chariot.
              </p>
            </div>
          </Col>
          <Col sm="4">
            <div className="tour-gallery">
              <a href={imgCard1}>
                <img src={imgCard1} alt="" />
              </a>
              <a href={imgCard2}>
                <img src={imgCard2} alt="" />
              </a>
              <a href={imgCard3}>
                <img src={imgCard3} alt="" />
              </a>
              <a href={imgCard4}>
                <img src={imgCard4} alt="" />
              </a>
            </div>
          </Col>
        </Row>
      </section>
    </Container>
    <section className="reviews">
      <Container>
        <section className="tour-msg text-center">
          <h1>Reviews and Suggestions</h1>
          <p>We're glad to hear something from you.</p>
          <form action="">
            <Row>
              <Col sm="6">
                <input
                  type="text"
                  name="Name"
                  id="reviewer-name"
                  placeholder="Your Name"
                  required
                />
                <br />
                <input
                  type="email"
                  name="Email"
                  id="reviewer-email"
                  placeholder="Your email"
                  required
                />
              </Col>
              <Col>
                <textarea
                  name="Message"
                  id="reviewer-message"
                  rows="4"
                  placeholder="Your Message"
                />
              </Col>
            </Row>
            <Button outline color="secondary" className="float-right">
              Submit
            </Button>
          </form>
        </section>
      </Container>
    </section>
  </div>
);

export default Tour;
