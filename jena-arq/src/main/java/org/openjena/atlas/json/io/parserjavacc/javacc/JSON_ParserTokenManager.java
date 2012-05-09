/* Generated By:JavaCC: Do not edit this line. JSON_ParserTokenManager.java */
/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openjena.atlas.json.io.parserjavacc.javacc ;

/** Token Manager. */
public class JSON_ParserTokenManager implements JSON_ParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x200000000L) != 0L)
            return 84;
         if ((active0 & 0x100000000L) != 0L)
            return 61;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 28);
      case 41:
         return jjStopAtPos(0, 29);
      case 43:
         return jjStartNfaWithStates_0(0, 32, 61);
      case 44:
         return jjStopAtPos(0, 30);
      case 45:
         return jjStartNfaWithStates_0(0, 33, 84);
      case 58:
         return jjStopAtPos(0, 31);
      case 91:
         return jjStopAtPos(0, 26);
      case 93:
         return jjStopAtPos(0, 27);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 123:
         return jjStopAtPos(0, 24);
      case 125:
         return jjStopAtPos(0, 25);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0xc00000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(3, 21);
         break;
      case 108:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(3, 23);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(4, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 102;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 11)
                        kind = 11;
                     jjCheckNAddStates(0, 6);
                  }
                  else if ((0x100003600L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  else if (curChar == 45)
                     jjCheckNAddStates(7, 11);
                  else if (curChar == 43)
                     jjCheckNAddStates(12, 16);
                  else if (curChar == 46)
                     jjCheckNAddTwoStates(51, 52);
                  else if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 32;
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 21;
                  if (curChar == 34)
                     jjCheckNAddStates(17, 19);
                  else if (curChar == 39)
                     jjCheckNAddStates(20, 22);
                  break;
               case 61:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(23, 26);
                  else if (curChar == 46)
                     jjCheckNAdd(64);
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(58, 59);
                  else if (curChar == 46)
                     jjCheckNAdd(62);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 14)
                        kind = 14;
                     jjCheckNAdd(57);
                  }
                  break;
               case 84:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(27, 30);
                  else if (curChar == 46)
                     jjCheckNAdd(87);
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(81, 82);
                  else if (curChar == 46)
                     jjCheckNAdd(85);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                     jjCheckNAdd(80);
                  }
                  break;
               case 1:
                  if ((0x8400000000L & l) != 0L && kind > 3)
                     kind = 3;
                  break;
               case 2:
                  if (curChar == 39)
                     jjCheckNAddStates(20, 22);
                  break;
               case 3:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAddStates(20, 22);
                  break;
               case 5:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(20, 22);
                  break;
               case 6:
                  if (curChar == 39 && kind > 6)
                     kind = 6;
                  break;
               case 7:
                  if (curChar == 34)
                     jjCheckNAddStates(17, 19);
                  break;
               case 8:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(17, 19);
                  break;
               case 10:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(17, 19);
                  break;
               case 11:
                  if (curChar == 34 && kind > 7)
                     kind = 7;
                  break;
               case 12:
                  if (curChar == 39)
                     jjCheckNAddStates(31, 34);
                  break;
               case 13:
               case 18:
                  if (curChar == 39)
                     jjCheckNAddTwoStates(14, 15);
                  break;
               case 14:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(31, 34);
                  break;
               case 16:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(31, 34);
                  break;
               case 17:
                  if (curChar == 39)
                     jjAddStates(35, 36);
                  break;
               case 19:
                  if (curChar == 39 && kind > 8)
                     kind = 8;
                  break;
               case 20:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 22:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 34)
                     jjCheckNAddStates(37, 40);
                  break;
               case 24:
               case 29:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(25, 26);
                  break;
               case 25:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(37, 40);
                  break;
               case 27:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(37, 40);
                  break;
               case 28:
                  if (curChar == 34)
                     jjAddStates(41, 42);
                  break;
               case 30:
                  if (curChar == 34 && kind > 9)
                     kind = 9;
                  break;
               case 31:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 33:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if ((0x100003600L & l) != 0L && kind > 1)
                     kind = 1;
                  break;
               case 35:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddStates(0, 6);
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAdd(36);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(37, 38);
                  break;
               case 38:
                  if (curChar != 46)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(39);
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(39);
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(40, 41);
                  break;
               case 41:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(42, 43);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(42, 43);
                  break;
               case 44:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(45);
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(45);
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(46, 47);
                  break;
               case 48:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(49);
                  break;
               case 49:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(49);
                  break;
               case 50:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(51, 52);
                  break;
               case 51:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(51);
                  break;
               case 52:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(52, 53);
                  break;
               case 54:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(55);
                  break;
               case 55:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(55);
                  break;
               case 56:
                  if (curChar == 43)
                     jjCheckNAddStates(12, 16);
                  break;
               case 57:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjCheckNAdd(57);
                  break;
               case 58:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(58, 59);
                  break;
               case 59:
                  if (curChar != 46)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(60);
                  break;
               case 60:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(60);
                  break;
               case 62:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(62);
                  break;
               case 63:
                  if (curChar == 46)
                     jjCheckNAdd(64);
                  break;
               case 64:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(64, 65);
                  break;
               case 66:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(67);
                  break;
               case 67:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(67);
                  break;
               case 68:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(23, 26);
                  break;
               case 69:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(69, 70);
                  break;
               case 70:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(71, 72);
                  break;
               case 71:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(71, 72);
                  break;
               case 73:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(74);
                  break;
               case 74:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(74);
                  break;
               case 75:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(75, 76);
                  break;
               case 77:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(78);
                  break;
               case 78:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(78);
                  break;
               case 79:
                  if (curChar == 45)
                     jjCheckNAddStates(7, 11);
                  break;
               case 80:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(80);
                  break;
               case 81:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(81, 82);
                  break;
               case 82:
                  if (curChar != 46)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(83);
                  break;
               case 83:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(83);
                  break;
               case 85:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(85);
                  break;
               case 86:
                  if (curChar == 46)
                     jjCheckNAdd(87);
                  break;
               case 87:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(87, 88);
                  break;
               case 89:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(90);
                  break;
               case 90:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjCheckNAdd(90);
                  break;
               case 91:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(27, 30);
                  break;
               case 92:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(92, 93);
                  break;
               case 93:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(94, 95);
                  break;
               case 94:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(94, 95);
                  break;
               case 96:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(97);
                  break;
               case 97:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjCheckNAdd(97);
                  break;
               case 98:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(98, 99);
                  break;
               case 100:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(101);
                  break;
               case 101:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 19)
                     kind = 19;
                  jjCheckNAdd(101);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if ((0x14404410000000L & l) != 0L && kind > 3)
                     kind = 3;
                  break;
               case 3:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(20, 22);
                  break;
               case 4:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(20, 22);
                  break;
               case 8:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(17, 19);
                  break;
               case 9:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(17, 19);
                  break;
               case 14:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(31, 34);
                  break;
               case 15:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 16:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(31, 34);
                  break;
               case 25:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(37, 40);
                  break;
               case 26:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 27:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(37, 40);
                  break;
               case 43:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(43, 44);
                  break;
               case 47:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(45, 46);
                  break;
               case 53:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(47, 48);
                  break;
               case 65:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(49, 50);
                  break;
               case 72:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(51, 52);
                  break;
               case 76:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(53, 54);
                  break;
               case 88:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(55, 56);
                  break;
               case 95:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(57, 58);
                  break;
               case 99:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(59, 60);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(20, 22);
                  break;
               case 8:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(17, 19);
                  break;
               case 14:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(31, 34);
                  break;
               case 25:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(37, 40);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 102 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   36, 37, 38, 40, 41, 46, 47, 80, 81, 84, 86, 91, 57, 58, 61, 63, 
   68, 8, 9, 11, 3, 4, 6, 69, 70, 75, 76, 92, 93, 98, 99, 13, 
   14, 15, 17, 18, 20, 24, 25, 26, 28, 29, 31, 44, 45, 48, 49, 54, 
   55, 66, 67, 73, 74, 77, 78, 89, 90, 96, 97, 100, 101, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, "\164\162\165\145", 
"\146\141\154\163\145", "\156\165\154\154", "\173", "\175", "\133", "\135", "\50", "\51", "\54", 
"\72", "\53", "\55", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3ffeffbcdL, 
};
static final long[] jjtoSkip = {
   0x2L, 
};
protected JavaCharStream input_stream;
private final int[] jjrounds = new int[102];
private final int[] jjstateSet = new int[204];
protected char curChar;
/** Constructor. */
public JSON_ParserTokenManager(JavaCharStream stream){
   if (JavaCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public JSON_ParserTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 102; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
