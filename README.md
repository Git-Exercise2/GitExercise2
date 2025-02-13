# Sorting Strings Feature

## Overview
This feature implements a function to **sort a list of strings** in ascending order. It ensures correct sorting using standard lexicographical order and includes a test case to verify functionality.

## Installation & Setup
1. Clone the repository to your local machine:
   ```sh
   git clone <repository-url>
   cd <repository-folder>
   ```
2. Switch to the master branch and pull the latest updates:
   ```sh
   git checkout master
   git pull origin master
   ```
3. Create a new feature branch for Sorting Strings:
   ```sh
   git checkout -b sorting-strings
   ```

## Usage
### Function Implementation
The function `sort_strings()` takes a list of strings as input and returns a sorted list.

```python
# sorting_strings.py

def sort_strings(string_list):
    """
    Sorts a list of strings in ascending order.
    :param string_list: List of strings
    :return: Sorted list of strings
    """
    return sorted(string_list)

# Example usage
if __name__ == "__main__":
    sample_strings = ["banana", "apple", "cherry", "date"]
    print(sort_strings(sample_strings))  # Output: ['apple', 'banana', 'cherry', 'date']
```

## Testing
A test case has been added to verify the sorting function.
Run the test using:
```sh
python -m unittest test_sorting_strings.py
```

Example test file (`test_sorting_strings.py`):
```python
import unittest
from sorting_strings import sort_strings

class TestSortingStrings(unittest.TestCase):
    def test_sort_strings(self):
        self.assertEqual(sort_strings(["banana", "apple", "cherry"]), ["apple", "banana", "cherry"])
        self.assertEqual(sort_strings(["zebra", "monkey", "ant"]), ["ant", "monkey", "zebra"])
        self.assertEqual(sort_strings([]), [])  # Edge case

if __name__ == "__main__":
    unittest.main()
```

## Pushing & Merging
1. After implementation, commit the changes:
   ```sh
   git add sorting_strings.py test_sorting_strings.py README.md
   git commit -m "Added sorting strings feature with tests"
   ```
2. Push the feature branch to the remote repository:
   ```sh
   git push origin sorting-strings
   ```
3. Create a **Pull Request (PR)** to merge into the master branch.
4. Resolve any comments, ensure tests pass, and then merge the PR.

## Notes
- Follow coding best practices and ensure code is **well-documented**.
- Regularly pull the latest `master` branch to avoid merge conflicts.
- Ensure all tests pass before merging into master.