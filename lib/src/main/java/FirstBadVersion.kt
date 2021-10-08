/* The isBadVersion API is defined in the parent class VersionControl.
      def isBadVersion(version: Int): Boolean = {} */

class FirstBadVersion: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var start = 1
        var end = n
        while (start < end) {
            //using mid = (start+end)/2 could reach to overflow
            val mid = start + (end - start) / 2
            if (isBadVersion(mid)) {
                end = mid
            } else {
                start = mid + 1
            }
        }
        return start
	}
}
