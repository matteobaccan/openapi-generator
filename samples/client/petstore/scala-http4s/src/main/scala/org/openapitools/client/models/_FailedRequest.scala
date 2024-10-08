/** OpenAPI Petstore
  * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
  *
  * The version of the OpenAPI document: 1.0.0
  * Contact: team@openapitools.org
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech
  * Do not edit the class manually.
  */
package org.openapitools.client.models

import io.circe.*
import io.circe.Decoder.*
import io.circe.Encoder.*
import io.circe.syntax.*

case class _FailedRequest(code: Int, message: String) extends Exception(s"Server return status code: $code; message: $message")

object _FailedRequest {

  given encoderFailedRequest: Encoder[_FailedRequest] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        "code" -> t.code.asJson,
        "message" -> t.message.asJson
      )
    }
  }

  given decodeFailedRequest: Decoder[_FailedRequest] = Decoder.instance { c =>
    for {
      code <- c.downField("code").as[Int]
      message <- c.downField("message").as[String]
    } yield _FailedRequest(
      code = code,
      message = message
    )
  }

}

