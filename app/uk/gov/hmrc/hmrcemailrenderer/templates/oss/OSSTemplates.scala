/*
 * Copyright 2021 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.hmrcemailrenderer.templates.oss

import uk.gov.hmrc.hmrcemailrenderer.domain.{ MessagePriority, MessageTemplate }
import uk.gov.hmrc.hmrcemailrenderer.templates.FromAddress
import uk.gov.hmrc.hmrcemailrenderer.templates.ServiceIdentifier.OSS

object OSSTemplates {
  val templates = Seq(
    MessageTemplate.create(
      templateId = "oss_registration_confirmation_pre_10th_of_month",
      fromAddress = FromAddress.noReply("VAT One Stop Shop Team"),
      service = OSS,
      subject = "HMRC: your registration for the One Stop Shop Union scheme",
      plainTemplate = txt.oss_registration_confirmation_pre_10th_of_month.f,
      htmlTemplate = html.oss_registration_confirmation_pre_10th_of_month.f,
      priority = Some(MessagePriority.Background)
    ),
    MessageTemplate.create(
      templateId = "oss_registration_confirmation_post_10th_of_month",
      fromAddress = FromAddress.noReply("VAT One Stop Shop Team"),
      service = OSS,
      subject = "HMRC: your registration for the One Stop Shop Union scheme",
      plainTemplate = txt.oss_registration_confirmation_post_10th_of_month.f,
      htmlTemplate = html.oss_registration_confirmation_post_10th_of_month.f,
      priority = Some(MessagePriority.Background)
    )
  )
}