# SpectraComparison
A nice D3JS spectra viewer to visualize and compare MS spectra. SMILES strings can be used to annotate m/z peaks using MetFrag's in silico fragmentation. Annotated fragments can be visualized by hovering over m/z peaks.

## Requirements
- Java >= 1.6
- Apache Maven ≥ 3.0.4

## Sources
- download sources by cloning git repository<br>
```bash
git clone https://github.com/c-ruttkies/SpectraComparison.git
```

## Build and Run
```bash
mvn clean tomcat7:run-war -DskipTests -Dmaven.tomcat.port=9080
```
- after the successful build Tomcat web server runs on port 9080<br>
- the tool can be accessed via pointing to http://localhost:9080/index.xhtml in the web browser<br>
