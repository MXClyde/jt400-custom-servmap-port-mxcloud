# jt400-custom-servmap-port-mxcloud

This repository is open source JTOPEN version 9.4 (http://jt400.sourceforge.net/) with a customization
to use the iSeries service mapper on port 8449 instead of 449. This customization affects the following files:

- java8/com/ibm/as400/access/PortMapper.java
- jtopenlite/com/ibm/jtopenlite/PortMapper.java
- src/com/ibm/as400/access/PortMapper.java

Using this customization, connectivity to IBM iSeries over an SSH tunnel can be established from the Mendix Cloud.
The customization is necessary because Mendix apps run unprivileged on the MxCloud and thus cannot bind to TCP ports < 1024.
