@file:Suppress("DEPRECATION" /* will be removed with 0.10.0 */)
package ch.tutteli.atrium.api.cc.en_GB.creating.iterable.contains.builders.impl

import ch.tutteli.atrium.api.cc.en_GB.atLeast
import ch.tutteli.atrium.api.cc.en_GB.atMost
import ch.tutteli.atrium.api.cc.en_GB.creating.iterable.contains.builders.AtMostCheckerOption
import ch.tutteli.atrium.api.cc.en_GB.exactly
import ch.tutteli.atrium.domain.builders.creating.iterable.contains.builders.AtMostCheckerOptionBase
import ch.tutteli.atrium.domain.creating.iterable.contains.IterableContains
import ch.tutteli.atrium.domain.creating.iterable.contains.searchbehaviours.InAnyOrderSearchBehaviour

/**
 * Represents the builder of a `contains at least once but at most` check within the fluent API of a
 * sophisticated `contains` assertion for [Iterable].
 *
 * @param T The input type of the search.
 *
 * @constructor Represents the builder of a `contains at least once but at most` check within the fluent API of a
 *   sophisticated `contains` assertion for [Iterable].
 * @param times The number which the check will compare against the actual number of times an expected entry is
 *   found in the [Iterable].
 * @param containsBuilder The previously used [IterableContains.Builder].
 */
internal class AtMostCheckerOptionImpl<out E, out T : Iterable<E>, out S : InAnyOrderSearchBehaviour>(
    times: Int,
    containsBuilder: IterableContains.Builder<E, T, S>
) : AtMostCheckerOptionBase<E, T, S>(
    times,
    containsBuilder,
    nameContainsNotValuesFun(),
    { "${containsBuilder::atMost.name}($it)" },
    { "${containsBuilder::atLeast.name}($it)" },
    { "${containsBuilder::exactly.name}($it)" }
), AtMostCheckerOption<E, T, S>
