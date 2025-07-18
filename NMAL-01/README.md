## **TASK-01: Improved Range Selection Approach in the Bisection Method**

### Introduction

The Bisection Method is a numerical technique for finding real roots of continuous functions. It works by repeatedly narrowing down an interval \([a, b]\) in which a root exists, based on the Intermediate Value Theorem. A fundamental requirement of the method is that the function \( f(x) \) must change sign over the interval, i.e., \( f(a) \cdot f(b) < 0 \). Therefore, selecting a proper initial range is crucial for the accuracy and convergence of the method.

Traditionally, the initial interval is selected manually based on intuition, plotting, or prior knowledge. However, this method is prone to human error and may not always capture the correct interval or all possible roots. A better and more systematic approach is to automatically scan a domain to detect valid intervals where sign changes occur.

---

### Traditional Approach

In the traditional method, the user selects an interval \([a, b]\) by inspection or guesswork and checks if \( f(a) \cdot f(b) < 0 \). If this condition is satisfied, the Bisection Method proceeds by repeatedly bisecting the interval and checking the sign of the function at the midpoint.

#### Limitations of the Traditional Approach:
- It requires prior knowledge of the function's behavior.
- It may fail if the selected interval does not contain a root.
- It is not suitable for detecting multiple roots.
- A large interval may increase the number of iterations, reducing efficiency.

---

### Improved Approach: Automatic Interval Scanning

A more robust and automated technique involves scanning a predefined domain to identify valid intervals for applying the Bisection Method. In this approach, the function is evaluated at small intervals across a domain \([x_{\text{min}}, x_{\text{max}}]\), and any subinterval \([x, x+\delta]\) satisfying \( f(x) \cdot f(x+\delta) < 0 \) is considered a valid range.

#### Steps of the Improved Approach:
1. Define a domain, e.g., \([-10, 10]\).
2. Choose a small step size, such as \( \delta = 0.1 \).
3. Loop through the domain and evaluate \( f(x) \) and \( f(x+\delta) \).
4. Identify all subintervals where a sign change occurs.
5. Apply the Bisection Method to each identified interval.

This method ensures that the root-finding process is automatic, systematic, and capable of detecting multiple roots within a given range.

---

### Mathematical Justification

The improved approach relies on the Intermediate Value Theorem, which states:

> If a function \( f \) is continuous on an interval \([a, b]\) and \( f(a) \cdot f(b) < 0 \), then there exists at least one root \( c \in (a, b) \) such that \( f(c) = 0 \).

By scanning the domain and checking for sign changes in consecutive subintervals, we ensure that all such valid intervals are detected without relying on intuition or manual guesses.

---

### Example

Consider the function:
\[
f(x) = 4x^2 + 3x - 3
\]

We do not know the exact root, so we scan the domain \([-10, 10]\) with a step size of \(0.1\):

- \( f(-2.0) = 7 \)
- \( f(-1.0) = -2 \)

Since \( f(-2.0) \cdot f(-1.0) < 0 \), the interval \([-2.0, -1.0]\) contains a root, and can be used in the Bisection Method.

---

### Comparison Table

| Criteria                        | Traditional Approach       | Improved Approach (Scanning)     |
|--------------------------------|----------------------------|----------------------------------|
| Interval Selection             | Manual                     | Automatic                        |
| Prior Knowledge Required       | Yes                        | No                               |
| Handles Multiple Roots         | No                         | Yes                              |
| Error-Prone                    | Yes                        | No                               |
| Scalable to Automation         | No                         | Yes                              |
| Efficiency                     | Depends on guess           | Systematic and reliable          |

---

### Conclusion

Choosing an appropriate interval is essential for the Bisection Method to work correctly and efficiently. While the traditional approach depends on manually selecting an interval, it may not always guarantee success, especially when the function’s behavior is unknown or complex. The improved method of interval scanning offers a more systematic and automated way to select valid intervals by detecting sign changes over a domain. This approach reduces human error, supports multiple root detection, and enhances the robustness and reliability of the root-finding process.
