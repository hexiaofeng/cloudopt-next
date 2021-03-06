/*
 * Copyright 2017 Cloudopt.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */
package cloudopt.next.client

import net.cloudopt.next.web.json.Jsoner


/*
 * @author: Cloudopt
 * @Time: 2018/1/31
 * @Description: Test Case
 */


fun main(args: Array<String>) {

    var client = HttpClient("https://www.cloudopt.net")

    client.get("/api/v1/grade/website/www.google.com").creat().send { result ->
        println(Jsoner.toJsonString(result.result().bodyAsString()))
    }
}

