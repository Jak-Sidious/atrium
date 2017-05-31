package ch.tutteli.atrium.reporting.translating

import ch.tutteli.atrium.reporting.ReporterBuilder
import java.util.*

object PropertiesPerLocaleTranslationProviderSpec : PropertiesBasedTranslationProviderSpec(
    ReporterBuilder
        .withTranslations(PropertiesPerLocaleTranslationProvider(), Locale("de", "CH", "Sensler"))
        .withDetailedObjectFormatter()
        .withSameLineAssertionMessageFormatter()
        .buildOnlyFailureReporting()
)
