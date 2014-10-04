//
//  BAMyRunViewController.m
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import "BAMyRunViewController.h"

@class BARestaurantSearchViewController;

@implementation BAMyRunViewController

- (IBAction)startRunButtonPressed:(id)sender {
    UIStoryboard *mainStoryboard = [UIStoryboard storyboardWithName:@"Main" bundle:[NSBundle mainBundle]];
    BARestaurantSearchViewController *restaurantSearchViewController = [mainStoryboard instantiateViewControllerWithIdentifier:@"BARestaurantSearchViewController"];
    
    [self presentViewController:(UIViewController *)restaurantSearchViewController animated:YES completion:nil];
}

@end
