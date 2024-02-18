class _0509:
  def fib(self, n: int) -> int:
    if n < 2:
      return n

    dp = [0, 0, 1]

    for i in range(2, n + 1):
      dp[0] = dp[1]
      dp[1] = dp[2]
      dp[2] = dp[0] + dp[1]

    return dp[2]

n = int(input("Enter a number: "))
solution = _0509()
print("Fibonacci number at position", n, "is:", solution.fib(n))

