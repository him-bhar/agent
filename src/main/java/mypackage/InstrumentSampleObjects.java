/*
 * Copyright 2013 Himanshu Bhardwaj
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package mypackage;

import static java.lang.System.out;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InstrumentSampleObjects
{
   public enum Color
   {
      RED,
      WHITE,
      YELLOW
   }

   /**
    * Print basic details including size of provided object to standard output.
    *
    * @param object Object whose value and size are to be printed to standard
    *   output.
    */
   public static void printInstrumentationSize(final Object object)
   {
      out.println(
           "Object of type '" + object.getClass() + "' has size of "
         + InstrumentationAgent.getObjectSize(object) + " bytes.");
   }

   /**
    * Main executable function.
    *
    * @param arguments Command-line arguments; none expected.
    */
   public static void main(final String[] arguments)
   {
      final StringBuilder sb = new StringBuilder(1000);
      final boolean falseBoolean = false;
      final int zeroInt = 0;
      final double zeroDouble = 0.0;
      final Long zeroLong = 0L;
      final long zeroLongP = 0L;
      final Long maxLong = Long.MAX_VALUE;
      final Long minLong = Long.MIN_VALUE;
      final long maxLongP = Long.MAX_VALUE;
      final long minLongP = Long.MIN_VALUE;
      final String emptyString = "";
      final String string = "ToBeOrNotToBeThatIsTheQuestion";
      final String[] strings = {emptyString, string, "Dustin"};
      final String[] moreStrings = new String[1000];
      final List<String> someStrings = new ArrayList<String>();
      final EmptyClass empty = new EmptyClass();
      final BigDecimal bd = new BigDecimal("999999999999999999.99999999");
      final Calendar calendar = Calendar.getInstance();

      printInstrumentationSize(sb);
      printInstrumentationSize(falseBoolean);
      printInstrumentationSize(zeroInt);
      printInstrumentationSize(zeroDouble);
      printInstrumentationSize(zeroLong);
      printInstrumentationSize(zeroLongP);
      printInstrumentationSize(maxLong);
      printInstrumentationSize(maxLongP);
      printInstrumentationSize(minLong);
      printInstrumentationSize(minLongP);
      printInstrumentationSize(maxLong);
      printInstrumentationSize(maxLongP);
      printInstrumentationSize(emptyString);
      printInstrumentationSize(string);
      printInstrumentationSize(strings);
      printInstrumentationSize(moreStrings);
      printInstrumentationSize(someStrings);
      printInstrumentationSize(empty);
      printInstrumentationSize(bd);
      printInstrumentationSize(calendar);
      printInstrumentationSize(Color.WHITE);
   }
}

