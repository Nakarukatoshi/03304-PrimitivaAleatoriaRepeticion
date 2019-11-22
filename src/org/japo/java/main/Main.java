/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        //Constantes
        int MIN_RND = 1;
        int MAX_RND = 49;
        int NUM_MARCAS = 6;
        //Variables
        int numeroRnd;

        //Bucle
        for (int i = 1; i < NUM_MARCAS + 1; i++) {
            numeroRnd = RND.nextInt(MAX_RND - MIN_RND + 1) + MIN_RND;
            System.out.printf("Número %1d ...: %1d%n",
                    i, numeroRnd);
        }
    }
}
