
import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

const val PHONE_REGEX = "^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?\$)\\d{10}\\s*s,?\$"
const val PHONE_REGEX_FORMAT = "^[+]*[(]{0,1}[0-9]{1,4}as[)]{0,1}[-\\s\\./0-9]*\$"
const val PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[\\\\\\/%§\"&“|`´}{°><:.;#')(@_\$\"!?*=^-]).{8,16}\$"

/**
 * Check given string is contain at least char and size
 * @receiver String
 * @return Boolean
 */

fun String.isValidPasswordLength(): Boolean {
    return (Pattern.compile(PASSWORD_PATTERN).matcher(this).matches())
}

/**
 * Thus fun is used to check email is valid or not.
 * @receiver String
 * @return Boolean
 */
fun String.isValidEmail(): Boolean = isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()

/**
 * This function is used to verify phone number
 * @param phone
 * @return
 */
fun String.verifyPhone(): Boolean {
    return !TextUtils.isEmpty(this) && this.length >= 14 && Pattern.compile(PHONE_REGEX_FORMAT).matcher(this).matches()
}

fun String.isValidPhone(): Boolean {
    return Pattern.compile(PHONE_REGEX).matcher(this).matches()
}

/**
 * Thus fun is used to check web url is valid or not.
 * @receiver String
 * @return Boolean
 */
fun String.VerifyWebUrl(): Boolean = Patterns.WEB_URL.matcher(this).matches()

//Remove all white spaces
fun String.removeWhitespaces() = replace(" ", "")
