Kortstokk/Kortspill
Oppgaven er å lage en kortstokk og et kortspill ved hjelp av objektorientert programmering i Java.

Oppgaven er åpen for egne tolkninger og implementasjoner. Du setter selv ambisjonsnivået på oppgaven.

Følgende krav til hva oppgaven må inneholde:

•En klasse PlayingCard som representerer et vanlig kort og inneholder:

- Farge/type: spar (♠), hjerter (♥), ruter (♦) og kløver (♣)
- Verdi: Ess, 2, 3, 4, 5, 6, 7, 8, 9, 10, knekt, dame, konge
- Indikasjon på om kortet er vist eller skjult. Dvs., om farge og verdi er synlig

• En klasse PlayingCardDeck som representerer en kortstokk på 52 kort av typen PlayingCard. PlayingCardDeck skal inneholder/representere:

- Minst en datastruktur for å lagre alle PlayingCard-objekt. F.eks. Array, ArrayList, LinkedList, HashMap, etc.

- En metode som henter det øverste/første kortet fra PlayingCardDeck. Implementer på valgfri måte hva som skal skje om kortstokken er tom når man kaller metoden. Skal den returnere null/false? Kaste en exception?

- En metode for å legge et kort underst i kortstokken (PlayingCardDeck).

• En spillklasse PlayingCardGame som bruker minst en instans av PlayingCardDeck for å spille et kortspill. PlayingCardGame skal inneholde/representere:

- Lage en blandet kortstokk som spillet kan benytte
- Kunne spille som en eller flere spillere (om spillet man lager kan spilles av flere spillere).
- Kunne vinne/tape/få uavgjort. Med andre ord - man skal kunne spille et kortspill.
- Inneholde en meny som gir brukeren følgende alternativ:

▪ Spill et parti
▪Vis spillregler
▪Avslutt spillet

Eksempel på kortspill
Høyt eller lavt?

To skjulte kort tas ut fra kortstokken: det ene kortet gis til deg, og det andre legges ut åpent slik at du kan se det. Du skal gjette om ditt skjulte kort er høyere eller lavere enn det åpne kortet. Om du gjetter rett har du vunnet, gjetter du feil har du tapt. Om kortene har samme verdi kan du sammenligne typen (spar (♠) > hjerter (♥) > ruter (♦) > kløver (♣)).

Etter et parti skal begge kortene legges bakerst/underst i kortstokken og man kan få spørsmål om man vil spille på nytt, eller gå tilbake til hovedmenyen.

Eksempel på andre spill:

Kabel
7-er kabal
Mot PC eller andre motspillere etter tur:
Svartepetter
Poker (valgfri variant)
21
Vri åtter
Andre kortspill du kan!
Hvordan du visualiserer kortspillet er valgfritt. Det enkleste er å bruke terminalen i IntelliJ for å skrive ut informasjon om kort som spilles og bruke tastaturet for å angi valg (f.eks. med Scanner-klassen). Om man vil kan man representere kort som er spilt med fin ASCII-grafikk.

Husk at det viktigste er å ha fokus på spillogikken og objektorientert programmering i Java. Det grafiske utseende er sekundært!

Ekstraoppgaver/utvidelser

Om du har tid og vil fordype deg ytterligere kan du gjøre følgende endringer:

Bruk Enum i PlayingCard for å representere type og verdi
Bruk abstrakte klasser. Lag en abstrakt klasse Card og modifiser klassen PlayingCard så den arver fra denne. Lag andre implementasjoner som arver fra denne. F.eks. UnoCard, PokemonCard, HockeyCard etc.
Bruk et interface. Lag et interface CardDeck som inneholder metoder man kan forvente seg at man kan bruke på en kortstokk. F.eks. takeCard, insertCard, shuffle,sort, osv. Endre klassen PlayingCardDeck så den implementerer interfacet CardDeck. Om du har laget andre kort (se forrige punkt) så bruk interfacet CardDeck til å lage andre spill (f.eks. UnoCardDeck, PokemonCardDeck, HockeyCard)