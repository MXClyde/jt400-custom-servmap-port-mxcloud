///////////////////////////////////////////////////////////////////////////////
//
// JTOpen (IBM Toolbox for Java - OSS version)
//
// Filename:  ConvTable864.java
//
// The source code contained herein is licensed under the IBM Public License
// Version 1.0, which has been approved by the Open Source Initiative.
// Copyright (C) 1997-2004 International Business Machines Corporation and
// others.  All rights reserved.
//
///////////////////////////////////////////////////////////////////////////////

package com.ibm.as400.access;

class ConvTable864 extends ConvTableBidiMap
{
    private static final String copyright = "Copyright (C) 1997-2004 International Business Machines Corporation and others.";

    private static final String toUnicode_ = 
      "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u000F" +
      "\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001C\u001B\u007F\u001D\u001E\u001F" +
      "\u0020\u0021\"\u0023\u0024\u0025\u0026\'\u0028\u0029\u002A\u002B\u002C\u002D\u002E\u002F" +
      "\u0030\u0031\u0032\u0033\u0034\u0035\u0036\u0037\u0038\u0039\u003A\u003B\u003C\u003D\u003E\u003F" +
      "\u0040\u0041\u0042\u0043\u0044\u0045\u0046\u0047\u0048\u0049\u004A\u004B\u004C\u004D\u004E\u004F" +
      "\u0050\u0051\u0052\u0053\u0054\u0055\u0056\u0057\u0058\u0059\u005A\u005B\\\u005D\u005E\u005F" +
      "\u0060\u0061\u0062\u0063\u0064\u0065\u0066\u0067\u0068\u0069\u006A\u006B\u006C\u006D\u006E\u006F" +
      "\u0070\u0071\u0072\u0073\u0074\u0075\u0076\u0077\u0078\u0079\u007A\u007B\u007C\u007D\u007E\u001A" +
      "\u00B0\u00B7\u2219\u221A\u2592\u2500\u2502\u253C\u2524\u252C\u251C\u2534\u2510\u250C\u2514\u2518" +
      "\u03B2\u221E\u03C6\u00B1\u00BD\u00BC\u2248\u00AB\u00BB\uFEF7\uFEF8\u001A\u001A\uFEFB\uFEFC\u200B" +
      "\u00A0\u00AD\uFE82\u00A3\u00A4\uFE84\u001A\u20AC\uFE8E\uFE8F\uFE95\uFE99\u060C\uFE9D\uFEA1\uFEA5" +
      "\u0660\u0661\u0662\u0663\u0664\u0665\u0666\u0667\u0668\u0669\uFED1\u061B\uFEB1\uFEB5\uFEB9\u061F" +
      "\u00A2\uFE80\uFE81\uFE83\uFE85\uFECA\uFE8B\uFE8D\uFE91\uFE93\uFE97\uFE9B\uFE9F\uFEA3\uFEA7\uFEA9" +
      "\uFEAB\uFEAD\uFEAF\uFEB3\uFEB7\uFEBB\uFEBF\uFEC3\uFEC7\uFECB\uFECF\u00A6\u00AC\u00F7\u00D7\uFEC9" +
      "\u0640\uFED3\uFED7\uFEDB\uFEDF\uFEE3\uFEE7\uFEEB\uFEED\uFEEF\uFEF3\uFEBD\uFECC\uFECE\uFECD\uFEE1" +
      "\uFE7D\uFE7C\uFEE5\uFEE9\uFEEC\uFEF0\uFEF2\uFED0\uFED5\uFEF5\uFEF6\uFEDD\uFED9\uFEF1\u25A0\u001A";


    private static final String fromUnicode_ = 
      "\u0001\u0203\u0405\u0607\u0809\u0A0B\u0C0D\u0E0F\u1011\u1213\u1415\u1617\u1819\u7F1B\u1A1D\u1E1F" +
      "\u2021\u2223\u2425\u2627\u2829\u2A2B\u2C2D\u2E2F\u3031\u3233\u3435\u3637\u3839\u3A3B\u3C3D\u3E3F" +
      "\u4041\u4243\u4445\u4647\u4849\u4A4B\u4C4D\u4E4F\u5051\u5253\u5455\u5657\u5859\u5A5B\u5C5D\u5E5F" +
      "\u6061\u6263\u6465\u6667\u6869\u6A6B\u6C6D\u6E6F\u7071\u7273\u7475\u7677\u7879\u7A7B\u7C7D\u7E1C" +
      "\uFFFF\u0010\u7F7F\uA07F\uC0A3\uA47F\uDB15\u7F7F\u7F97\uDCA1\u7F7F\u8093\u7F7F\u7F7F\u1481\u7F7F" +
      "\u7F98\u9594\uFFFF\f\u7F7F\u7FDE\uFFFF\u000F\u7F7F\u7FDD\uFFFF\u015D\u7F7F\u907F\uFFFF\t" +
      "\u7F7F\u927F\uFFFF\u0122\u7F7F\uAC7F\uFFFF\u0006\u7F7F\u7FBB\u7F7F\u7FBF\u7FC1\uC2C3\uC4C7\uC6C7" +
      "\uC8C9\uCACB\uCCCD\uCECF\uD0D1\uD2D3\uD4D5\uD6D7\uD8D9\uDA7F\u7F7F\u7F7F\uE0E1\uE2E3\uE4E5\uE6E7" +
      "\uE8E9\uFD7F\u7F7F\u7F7F\u7FF1\uFFFF\u0007\u7F7F\uB0B1\uB2B3\uB4B5\uB6B7\uB8B9\u252C\u2E2A\uFFFF" +
      "\u0CCE\u7F7F\u7F9F\uFFFF\u0018\u7F7F\u137F\uFFFF\u0037\u7F7F\uA77F\uFFFF\u0071\u7F7F\u1B18\u1A19" +
      "\u1D12\uFFFF\t\u7F7F\u177F\uFFFF\u0037\u7F7F\u7F82\u837F\u7F7F\u911C\uFFFF\u0014\u7F7F\u967F" +
      "\uFFFF\u015B\u7F7F\u857F\u867F\uFFFF\u0004\u7F7F\u8D7F\u7F7F\u8C7F\u7F7F\u8E7F\u7F7F\u8F7F\u7F7F" +
      "\u8A7F\u7F7F\u7F7F\u7F7F\u887F\u7F7F\u7F7F\u7F7F\u897F\u7F7F\u7F7F\u7F7F\u8B7F\u7F7F\u7F7F\u7F7F" +
      "\u877F\uFFFF\t\u7F7F\u0506\u7F7F\u0D7F\u7F0C\u7F7F\u0E7F\u7F0F\u7F7F\u0A7F\u7F08\u7F7F\u097F" +
      "\u7F0B\u7F7F\u077F\uFFFF\u0012\u7F7F\u847F\uFFFF\u0006\u7F7F\uFE7F\uFFFF\u0005\u7F7F\u167F\u7F7F" +
      "\u7F7F\u1E7F\u7F7F\u7F7F\u7F7F\u107F\u1F7F\u7F7F\u7F7F\u7F7F\u117F\uFFFF\u003A\u7F7F\u017F\u047F" +
      "\uFFFF\u0016\u7F7F\u027F\u037F\uFFFF\u6C07\u7F7F\uF1F0\u7F7F\uC1C2\uA2C3\uA5C4\uC4C7\uA8C6\uC6C6" +
      "\uC6C7\uA8A9\uA9C8\uC8C9\uC9AA\uAACA\uCAAB\uABCB\uCBAD\uADCC\uCCAE\uAECD\uCDAF\uAFCE\uCECF\uCFD0" +
      "\uD0D1\uD1D2\uD2BC\uBCD3\uD3BD\uBDD4\uD4BE\uBED5\uD5EB\uEBD6\uD6D7\uD7D7\uD7D8\uD8D8\uD8DF\uC5D9" +
      "\uECEE\uEDDA\uF7BA\uBAE1\uE1F8\uF8E2\uE2FC\uFCE3\uE3FB\uFBE4\uE4EF\uEFE5\uE5F2\uF2E6\uE6F3\uF3E7" +
      "\uF4E8\uE8E9\uF5FD\uF6EA\uEAF9\uFA99\u9A9D\u9E9D\u9E7F\u7F7F\u7F21\u2223\u2425\u2627\u2829\u2A2B" +
      "\u2C2D\u2E2F\u3031\u3233\u3435\u3637\u3839\u3A3B\u3C3D\u3E3F\u4041\u4243\u4445\u4647\u4849\u4A4B" +
      "\u4C4D\u4E4F\u5051\u5253\u5455\u5657\u5859\u5A5B\u5C5D\u5E5F\u6061\u6263\u6465\u6667\u6869\u6A6B" +
      "\u6C6D\u6E6F\u7071\u7273\u7475\u7677\u7879\u7A7B\u7C7D\u7E7F\uFFFF\u0044\u7F7F\u861B\u181A\u19FE" +
      "\uFFFF\t\u7F7F";


    ConvTable864()
    {
        super(864, toUnicode_.toCharArray(), fromUnicode_.toCharArray());
    }
}
