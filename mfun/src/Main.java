/*          Main.java file of musical-funicular
    Copyright (C) 2020  Dante Falzone

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

package mfun;

public class Main {

    public static void consMsg(String message) {
        try {
            System.out.println(message);
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        consMsg("Welcome to the Musical Funicular!");
        consMsg("You are a cyclist on the way to a party.");
    }

}